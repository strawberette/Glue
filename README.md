# glue
## Design patterns in Java

In this exercise I first created a Glue interface to define the behaviour of the classes that implemented it, and a Factory to instantiate the classes. Then I created an abstract class which was later extended by the classes SuperGlue, PrittStick and WoodGlue.
Then I created another interface (Display), which was in turn implemented by some classes (StandardDisplay, FrenchDisplay, ItalianDisplay.) I then created a dependency injection by injecting the Display interface to use via the Factory.
Finally, I created a Strategy, that implemented the Glue interface and described the behaviour of the classes. This way I could instantiate the classes through the Strategy class.
