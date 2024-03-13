interface Good {
    String PrintName();

    double PrintPrice();

    double PrintRating();
}

class Chok implements Good {
    String name;
    double price;
    double rate;

    Chok(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }


    public String PrintName() {
       return name;
    }

    public double PrintPrice() {
        return price;
    }

    public double PrintRating() {
        return rate;
    }
}

class Tea implements Good {
    String name;
    double price;
    double rate;

    Tea(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }


    public String PrintName() {
        return name;
    }

    public double PrintPrice() {
        return price;

    }

    public double PrintRating() {
        return rate;

    }
}

class Shapmoo implements Good {
    String name;
    double price;
    double rate;

    Shapmoo(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String  PrintName() {
        return name;
    }

    public double PrintPrice() {
        return price;

    }

    public double PrintRating() {
        return rate;

    }
}

interface User {
    String login();

    String password();
}

class Vasya implements User {
    public String pass;
    public String log;

    Vasya(String pass, String log) {
        this.log = log;
        this.pass = pass;
    }

    public String login() {
        return pass;
    }

    public String password() {
        return  pass;
    }


}

class Katya implements User {
    public String pass;
    public String log;

    Katya(String pass, String log) {
        this.log = log;
        this.pass = pass;
    }

    public String login() {
        return pass;
    }

    public String password() {
        return pass;
    }
}

class Pasha implements User {
    public String pass;
    public String log;

    Pasha(String pass, String log) {
        this.log = log;
        this.pass = pass;
    }

    public String login() {
        return log;
    }

    public String  password() {
        return pass;
    }
}

class purchase implements Good, User   {
    Good g;
    User u;

   public String PrintName(){
       return g.PrintName();
   }
   public double PrintPrice(){
       return g.PrintPrice();

   }
   public double PrintRating(){
       return g.PrintRating();
   }
   public String login(){
       return u.login();

   }
   public String password(){
       return u.password();
   }
    public purchase(Good g, User u) {
        this.g = g;
        this.u = u;
    }

    public void Purchase(User u, Good g){
        System.out.println("Товар "  + g.PrintName()   + " купил человек с логином "  + u.login());
    }
}


public class Main {
    public static void main(String[] args) {
        Good g1 = new Chok("alpen gold", 100, 4.3);
        User u1 = new Katya("edvsdvvd", "katya1232");
        User u2 = new Pasha("eweweee", "wedswedsw");
        Good g2 = new Shapmoo("AVE", 232, 5.0);
        purchase p = new purchase(g1,u1);
        purchase p2 = new purchase(g2,u2);
        p.Purchase(u1, g1);
        p2.Purchase(u2,g2);


    }
}
