package dp.singleton;



// 1. break singleton DP : using Reflection Api :
// using this : can access and change members at runtime

class SingletonReflApi {
    private static SingletonReflApi sr ;
    private SingletonReflApi(){}
    public static SingletonReflApi getSingletonReflApi(){
        if(sr == null){
            sr = new SingletonReflApi();
        }
        return sr;
    }

}

// solution : Reflection API
class SingletonReflApiSl {
    private static SingletonReflApiSl sr ;

    private SingletonReflApiSl(){
        //here soln of ref api breakage;
        if(sr != null){
            System.out.println("single");
            throw new RuntimeException("trying to break singleton");
        }
    }

    public static SingletonReflApiSl getSingletonReflApiSl(){
        if(sr == null){
            sr = new SingletonReflApiSl();
        }
        return sr;
    }

}


//solution 2 . using enums

enum SingleSl2{
    INSTANCE;
    public void hi(){
        System.out.println("hi enum solns");
    }
}


// 2. way of break : De-serializable and serializable
// 3. way of break : cloning of object
