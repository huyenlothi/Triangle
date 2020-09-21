public class TriangleClassifier {
    public static String getTriangleClassifier(int firstAdge, int secondAdge, int thirdAdge){

        if(firstAdge==secondAdge
                && secondAdge==thirdAdge
                && firstAdge>0 && secondAdge>0 && thirdAdge>0){
            return  "Equilateral Triangle";
        }else if(((firstAdge==secondAdge && (firstAdge+secondAdge>thirdAdge))
                || (firstAdge==thirdAdge && (firstAdge+thirdAdge>secondAdge))
                || ((secondAdge==thirdAdge && (secondAdge+thirdAdge)>firstAdge)))
                && (firstAdge>0 && secondAdge>0 && thirdAdge>0)){
            return "Isosceles Triangle";
        }else if((firstAdge+secondAdge>thirdAdge)
                && (firstAdge+thirdAdge>secondAdge)
                && (secondAdge+thirdAdge>firstAdge)
                && firstAdge>0 && secondAdge>0 && thirdAdge>0){
            return "Often Triangle";
        }
        return "Not a Triangle";
    }
}
