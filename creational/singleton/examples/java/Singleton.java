class Singleton{

private static Singleton s =null;
private String string = null;
    private Singleton(String string){ //Private constructor
        if (s==null){
            this.string = string;
            s = this;
        }
        else{
            throw new IllegalStateException("Singleton already initialized");
        }
    }
    public static Singleton getInstance(String string){
        if (s==null){
            return new Singleton(string);
        }
        else{
            return s;
        }
    }
    public String getString(){
        return string;
    }
}