/*
 * This is an example of Anonymous classes
 */
package helloworldanonymousclasses;

/**
 *
 * @author Katutza
 */
public class HelloWorldAnonymousClasses {

      public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
      
    public void sayHello() {
        HelloWorld EnglishGreeting = new EnglishGreeting();
        HelloWorld SpanishGreeting = new SpanishGreeting();
        HelloWorld FrenchGreeting = new FrenchGreeting ();
            
        EnglishGreeting.greet();
        FrenchGreeting.greetSomeone("Fred");
        SpanishGreeting.greet();
        
        }
    }