/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldanonymousclasses;

/**
 *
 * @author Katutza
 */
class EnglishGreeting implements HelloWorld {

        @Override
    public void greet() {
    greetSomeone("world");
            }

        @Override
    public void greetSomeone(String someone) {
    String name = someone;
    System.out.println("Hello " + name);
            }
}



