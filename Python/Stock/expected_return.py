import numpy as np
import matplotlib.pyplot as plt

class Stock:
    def __init__(self, current_price, total_budget_month, average_yearly_return, total_period, dividend_month):
        self.current_beginning = current_price
        self.budget_month = total_budget_month
        self.average_yearly_return = average_yearly_return
        self.total_period = total_period
        self.dividend_per_stock = dividend_month

    #Fix this to general case
    def current_price(self, month_passed)->float:
        if month_passed <= 12:
            return self.current_beginning
        elif month_passed > 12 and month_passed <= 24:
            return self.current_beginning * (1 + self.average_yearly_return * 0.01)
        elif month_passed > 24:
            count = self.current_beginning * (1 + self.average_yearly_return * 0.01)
            count = count * (1 + self.average_yearly_return * 0.01)
            return count

    def stock_num(self):
        total_stock_num_month = []
        for month in range(self.total_period):
            #Int not callable error
            num_month = 14
            if month == 0:
                total_stock_num_month.append(num_month)
            else:
                total_stock_num_month.append(total_stock_num_month[month-1] + num_month)
        return total_stock_num_month

    def value_month(self):
        stock_price_month = []
        for i in range(self.total_period):
            stock_price_month.append(self.current_price(i))

        out_list = []
        for i in range(len(self.stock_num())):
            out_list.append(self.stock_num()[i]*stock_price_month[i])
        return out_list

    def dividend(self):
        dividend_per_month = []
        for i in range(len(self.stock_num())):
            dividend_per_month.append(self.stock_num()[i] * self.dividend_per_stock)

        for i in range(1, len(dividend_per_month)):
            dividend_per_month[i] += dividend_per_month[i-1]
        return dividend_per_month

    def total_return(self)->float:
        total_dividend = self.stock_dividned()[self.total_period-1]
        total_margin = self.stock_value()[self.total_period-1] - self.budget_month * self.total_period
        return total_dividend + total_margin

#start from 0, 3 year expected returns
month = np.linspace(1, 36, 36)

#dividend return

spdr_djia = Stock(300, 4000, 15, 36, 0.4)

total_stock_num = spdr_djia.stock_num()
total_stock_value = spdr_djia.value_month()
total_dividend = spdr_djia.dividend()

plt.plot(month, total_dividend, 'r')
plt.plot(month, total_stock_value, 'g')
plt.show()
