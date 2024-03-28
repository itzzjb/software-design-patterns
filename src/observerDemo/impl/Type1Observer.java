package observerDemo.impl;

import observerDemo.Observer;

public class Type1Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type 1 Observer received the event: " + event);
    }
}
