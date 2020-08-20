public class Index {
    public static void main(String[] args) {
        BmService bmService = new BmService();
        int bodyweight;
        bodyweight = 58;
        float bodyheight = 1.65f;

        float bmIndex = bmService.calculate(bodyweight, bodyheight);
        System.out.println(bmIndex);

    }
}
