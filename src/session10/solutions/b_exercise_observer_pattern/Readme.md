In this exercise, you have a class *NewsFeed* where 
you can add email subscribers (providing the email address) 
and App subscribers (providing the phone id). This class also 
has a method *notifySubscribers*, which sends to all the subscribers
novel news. 

Try to refactor these classes using the **Observer design 
pattern** in order to better handle the subscription and 
notification process.

Hints:
- Create an interface "Subscriber" with one method: "void update(String news)".
- Create two classes: "EmailSubscriber" and "AppSubscriber" implementing the "Subscriber" interface.
- Refactor the NewsFeed class using the "Subscriber" interface.
