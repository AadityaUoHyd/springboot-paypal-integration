# springboot-paypal-integration demo program.

#First get your own paypal clientId & paypal ClientSecret from registering yourself in : 
https://developer.paypal.com/

Now put your clientId & clientSecret in your “application.properties” file.

# Run the code as SpringBoot program.

# Hit url : http://localhost:9191/ 
It’ll take you to our home.html  page.
Here, fill all the details such as Total amount which be come filled default, Currency say “USD”, Payment Method say “paypal”, Intention as “sale” will be filled default,  Description of payment any thing you want to fill. Now click on continue to check out, and it’ll take you to Payment gateway page, where provide your paypal credentials to login and pay.

# Click on continue for payment to be process. Now based on payment got success or failure you’ll receive msg from our success.html or cancel.html
