# Shopper
This is a rewrite of my earlier project 'ShoppingCart' as practice coding in Scala. It is an interesting little task that I have found covers a lot of aspects and useful to try in any language.

The premise is simple, create an application that can handle creating a shopping basket of items; can apply applicable discounts based on the contents of the basket, and print the receipt to include the values of [SubTotal], [Total] and the [Savings] the the shopping qualified for.

The project only contains 3 items and 2 deals to begin with, however it should be written in a way that is extensible enough to add new deals, new food items and so on i.e. try and cover as many extension points as possible.

### TODO
* Add Formatter trait, to allow custom formatting of the receipt print out
* Add parser for command line input