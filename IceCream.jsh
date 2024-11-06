 int vanillaPrice=49;
 int chocolatePrice=42;
 int strawberryPrice=80;
 int conePrice=100;
void processOrder(String flavor,int scoops){
    if ("v".equals(flavor)){
            double totalCost=conePrice+vanillaPrice*scoops;
            System.out.printf("That will be %.2f please.",totalCost);}
        else if ("c".equals(flavor)){
            double totalCost=conePrice+chocolatePrice*scoops;
            System.out.printf("That will be %.2f please.",totalCost);}
        else if("s".equals(flavor)){
            double totalCost=conePrice+strawberryPrice*scoops;
            System.out.printf("That will be%.2f please.",totalCost);}
        else{
            System.out.println("We don't have that flavor.");
        }
    }
