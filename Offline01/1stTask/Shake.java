public class Shake implements ShakeIngredients {
    private String Name;
    private String MilkType;
    private String SweetenerType;
    private String Ingredient1;
    private String Ingredient2;
    private String Topping;

    @Override
    public void setName(String name) {
        this.Name=name;
    }

    @Override
    public void setMilktype(String milk) {
        this.MilkType=milk;
    }

    @Override
    public void setSweetenerType(String sweetener) {
        this.SweetenerType=sweetener;

    }

    @Override
    public void setIngredient1(String ingredient1) {
        this.Ingredient1=ingredient1;

    }

    @Override
    public void setIngredient2(String ingredient2) {
        this.Ingredient2=ingredient2;

    }

    @Override
    public void setTopping(String topping) {
        this.Topping=topping;

    }

    public String getName() {
        return Name;
    }

    public String getMilkType() {
        return MilkType;
    }

    public String getSweetenerType() {
        return SweetenerType;
    }

    public String getIngredient1() {
        return Ingredient1;
    }

    public String getIngredient2() {
        return Ingredient2;
    }

    public String getTopping() {
        return Topping;
    }















    public void printDetails() {
        System.out.println("***"+this.Name+"***");
        System.out.println();
        System.out.println("Base Ingredients:");
        System.out.println(this.getMilkType());
        System.out.println(this.getSweetenerType());
        System.out.println(this.getIngredient1());
        System.out.println(this.getIngredient2());
        System.out.println();
        System.out.println("Added Ingredients:");
        System.out.println("Topping: "+this.getTopping());
        System.out.println();

        System.out.println("Price Details:");
        {
            if (this.Name.equalsIgnoreCase("Chocolate Shake") || this.Name.equalsIgnoreCase("Coffee Shake")) {
                System.out.println(this.Name + ": 230");
            } else if (this.Name.equalsIgnoreCase("Strawberry Shake")) {
                System.out.println(this.Name + ": 200");
            } else if (this.Name.equalsIgnoreCase("Vanilla Shake")) {
                System.out.println(this.Name + ": 190");
            } else if (this.Name.equalsIgnoreCase("Zero Shake")) {
                System.out.println(this.Name + ": 240");
            }
        }

        if (this.getMilkType().equalsIgnoreCase("Lactose-Free Milk"))
        {
            System.out.println("Lactose-free milk: +60");
        }
        { if (this.getTopping().equalsIgnoreCase("Null"))
        {
            System.out.println("No extra topping: +00");
        }
        else if (this.getTopping().equalsIgnoreCase("Candy"))
        {
            System.out.println("Topping(Candy): +50");
        }
        else if (this.getTopping().equalsIgnoreCase("Cookie"))
        {
            System.out.println("Topping(Cookie): +40");
        }
        }
        System.out.println();

        System.out.println("Total price of the "+this.Name+": "+this.totalPrice());

    }


    public int totalPrice() {
        int total=0;
        if (this.Name.equals("Chocolate Shake")|| this.Name.equals("Coffee Shake"))
        {
            total=230;
        }
        else if (this.Name.equals("Strawberry Shake"))
        {
            total=200;
        }
        else if (this.Name.equals("Vanilla Shake"))
        {
            total=190;
        }
        else if (this.Name.equals("Zero Shake"))
        {
            total=240;
        }

        if (this.MilkType.equals("Lactose-Free Milk"))
        {
            total=total+60;
        }

        if (this.Topping.equals("Candy"))
        {
            total=total+50;
        }

        else if (this.Topping.equals("Cookie"))
        {
            total=total+40;
        }
        return total;

    }





}
