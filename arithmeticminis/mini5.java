class mini5
{
    public static void main(String args[])
    {
        byte normalPrice=15;
        double discount=0.1;
        double subtraction=(double)(normalPrice*discount);
        System.out.println("normal price = "+ normalPrice);
        System.out.println("discount = "+ subtraction);
        System.out.println("total price = "+(normalPrice - subtraction));

    }
}