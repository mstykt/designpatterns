package com.designpatterns.iterator;

/**
 * Created by mesut on 05.08.2016.
 */
public class AppContanierImpl implements AppContainer {
    private String myArray[] = {"John", "Alice", "David", "Mary"};

    public AppIterator createIterator() {
        return new AppIteratorImpl();
    }

    //Parameter Type of AppIterator has to be array type
    private class AppIteratorImpl implements AppIterator<String>{

        int index;

        public boolean hasNext() {
            if (index < myArray.length)
                return true;
            else
                return false;
        }

        public String next() {
            if (this.hasNext())
                return myArray[index++];
            else
                return null;
        }
    }
}
