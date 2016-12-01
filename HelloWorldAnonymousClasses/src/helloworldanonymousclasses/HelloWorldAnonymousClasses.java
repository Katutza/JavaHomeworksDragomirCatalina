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
        class EnglishGreeting implements HelloWorld {
            HelloWorld EnglishGreeting = new EnglishGreeting();
            String name = "world";
            
            @Override
            public void greet() {
                EnglishGreeting.greet();
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
            System.out.println("Hello " + name);
            }
        }
    }
             
        class SpanishGreeting implements HelloWorld {
            HelloWorld SpanishGreeting = new SpanishGreeting();
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
                SpanishGreeting.greet();
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
        } 
    }
        class FrenchGreeting implements HelloWorld {
            HelloWorld FrenchGreeting = new FrenchGreeting ();
            String name = "tout le monde";
                
         @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                FrenchGreeting.greetSomeone("Fred");
                System.out.println("Salut " + name);
            } 
        }
    }