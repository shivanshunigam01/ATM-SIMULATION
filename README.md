
# ATM SIMULATION 

  The aim of the ATM Simulation System project is to build a Java based ATM (Automated Teller Machine) Simulation System. The introduction of ATM’s by various banks have brought about freedom from the interminable queues in front of withdrawal counters at banks. This ATM Simulation System requires the constant updating of records between the bank servers and a spread out network of ATM’s.

## MODULES

ATM Simulation System Modules
Advertiser: The Bank can use free screen time to advertise their products. This will be possible only when no user is using the ATM for a transaction.

Authenticator: This is the module that will first present itself to a user. The user will have to present their ATM card and enter their PIN which will be checked with the secure database at the Bank Central Server. This module will also enable users to change their PIN.

Maintenance: This module will maintain a log of all updates and maintenance of the ATM. It will notify the central server of impending maintenance. In the event of delayed maintenance it will put the ATM in reduced functionality lock down mode.

Transaction: This is the module that handles all user interaction with the Bank Central Server after successful authentication. It will allow for bank account balance checking and for withdrawals made. It will log any changes in account details in the Bank Central Server.

Admin: The admin will operate from the Bank Central Server. The admin module will ensure that only updated databases are used by the transaction module. The maintenance of the machine can be remotely postponed by an authorised user through the admin module.

