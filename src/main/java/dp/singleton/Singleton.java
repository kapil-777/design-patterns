package dp.singleton;

//this is the lazy way of the object creation : mean when needed that time object is created

class Singleton {
    // 2.make static container for the obj

    private static Singleton sing;

    // 1.make constructor private
    private Singleton() {
    }

    // 3.create the method that gives the singleton object of the class

    public static Singleton getSingleton() {
        // by this only once the object is created in project
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }
}

// ---------------------------------------------------------//

// eager way of singleton creation : but not good way

class Eager {
    private static Eager e = new Eager();
    public static Eager getEager() {
        return e;
    }
}


//thread safety way of singleton creation : prevent the object creation from the multiple thread
//by using the 'Synchronized block'

class ThreadSafeSingle {
    private static ThreadSafeSingle t ;

    private ThreadSafeSingle(){}

    public static ThreadSafeSingle getThreadSafeSingle(){

        if(t == null){

            synchronized(ThreadSafeSingle.class){
                if(t==null){
                    t = new ThreadSafeSingle();
                }
            }
        }

        return t;
    }
}