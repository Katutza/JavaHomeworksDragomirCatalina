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
class SpanishGreeting implements HelloWorld {

        @Override
    public void greet() {
    greetSomeone("mundo");
            }

        @Override
    public void greetSomeone(String someone) {
    String name = someone;
    System.out.println("Hola " + name);
            }
}
