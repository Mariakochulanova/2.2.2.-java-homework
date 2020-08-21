public class Index {
    public static void main(String[] args) {
        BmService bmService = new BmService();
        int bodyWeight;
        bodyWeight = 58;
        float bodyHeight = 1.65f;

        float bmIndex = bmService.calculate(bodyWeight, bodyHeight);
        System.out.println(bmIndex);

    }
}
