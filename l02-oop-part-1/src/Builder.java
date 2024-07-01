public non-sealed class Builder extends Worker {
//    public -> protected -> private
    // fields -> constr -> method -> inner classes

    @Override
    public void work() {
        System.out.println("Builder work");
        doWork();
    }

    private void doWork() {
        System.out.println("doWork");
    }

    private static class InnerBuilder {

    }
}

class ExtendedBuilder extends Builder{

}
// Alt + Insert