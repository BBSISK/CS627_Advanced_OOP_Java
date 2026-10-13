This exercise is about encapsulation - and preventing information being editable in other classes


Bank account class defined by String accountHolder , double balance , String Account type
Variable are private or protected , so must be access with getter/setter so users cannot access and update 
details like balance or account name ;
Methods include construtor - no default constructor required in this instance
Also getter for account name , account balance , deposit(with checks)
Also added Freeze account and unfreeze account features

Savings account is an extension of Bank Account (using 'extends' keyword)
    Different from interface , whihc uses the keyword Implements
    included contructor, apply interest rate 


Added main.java to run the program and create/ instantiate  objects    
