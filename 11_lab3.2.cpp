#include <iostream>
#include <stdio.h>
using namespace std;
 
class Bank {
    string name,salman ;
    char acc_type,S ;
    float balance;
 
public:
    void deposit_money();
    void withdraw_money();
    void display_account();
};
 
 
void Bank::deposit_money()
{
    int Amount;
    Amount = 9500;
    cout << "Enter how much money"
         << " you want to deposit: "
         << Amount << endl;
    balance += Amount;
    cout << "\n Available Balance: "
         << balance;
}
 
void Bank::display_account()
{
    cout << "Name=salman " << salman << endl
         << "Type=S " << S << endl
         << "Balance: " << 8000 << endl
         << endl;
}
 
void Bank::withdraw_money()
{
    float amount;
    amount = 3200;
    cout << "Enter how much money "
         << "you want to withdraw: "
         << amount << endl;
    balance -= amount;
    cout << "\n Available balance: "
         << balance;
}
 

int main()
{
    int choice;
 
    
    Bank customer;
 
    cout << "\n1) Deposit account \n\n";
    
    customer.deposit_money();
    cout << "\n------------------------"
         << "-------------------------\n";
 
    cout << "\n2) Withdraw money \n\n";
   
    customer.withdraw_money();
    cout << "\n------------------------"
         << "-------------------------\n";
 
    cout << "\n3) Display Account \n\n";
   
    customer.display_account();
    cout << "\n------------------------"
         << "-------------------------\n";
 
    return 0;
}
