I chose Change of Responsibility and Oberver Pattern.

Chain of Responsibility:

Whenever a table is available the waitlisted customer will be checked for number of people in it's party. If table can't accomodate the party, it will be offered to the next person in line.

Observer Pattern:

The table manager will observer for any availability of the table and will be notified when a table is available. It then will send message to the waitlist.

Customer

    Responsibility:
        - Knows name
        - Knows cell phone number
        - Knows number of people in party
        - Sign-up for the table
        - Leave waitlist
    Collaborators:
        - Table Manager

Table Manager

    Responsibilities:
        - Knows the waitlist
        - Adds customer to waitlist
        - Notifies the customer for which table is available
        - Removes customer from waitlist
    Collaborators:
        - Customers
        - Waitlist

Waitlist

    Responsibilities:
        - Maintains waitlisted customers
    Collaborators:
        - Table Manager

Table Availability

    Responsibilities:
        - knows available tables
        - Notifies Table Manager when table becomes available
    Collaborators:
        - Table Manager
