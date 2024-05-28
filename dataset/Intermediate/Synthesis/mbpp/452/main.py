def loss_amount(actual_cost,sale_amount): 
  if(sale_amount > actual_cost):
    amount = sale_amount - actual_cost
    return amount
  else:
    return 0