public class MultNumbers implements Chain{
    private Chain nextInChain;
    public void setNextChain(Chain nextChain){
        this.nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted()=="mult"){
            System.out.println(request.getNumber1() + " * " + request.getNumber2()
                    + " = " + (request.getNumber1()*request.getNumber2()));
        } else  {
            nextInChain.calculate(request);
        }

    }
}
