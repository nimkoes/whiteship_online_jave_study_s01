package me.xxxelppa.study.week09;

public class Exam_005 {
    public static void main(String[] args) {
        
        boolean isSnack = true;
        boolean isMilk = true;
        boolean isFood = true;
        
        try (Refrigerator refrigerator = new Refrigerator()){
            
            // 냉장고 문을 연다.
            
            // 간식을 찾는다.
            
            // 간식이 없으면 예외 발생
            if(!isSnack) throw new SnackNotFoundException();
            
            // 우유가 없으면 예외 발생
            if(!isMilk) throw new MilkNotFoundException();
            
            // 먹을게 없으면 예외 발생
            if(!isFood) throw new FoodNotFoundException();
            
            // 간식을 꺼낸다.
            
        } catch (Exception e) {
            if(e instanceof SnackNotFoundException) {
                // 간식이 없으면 실행하는 블록
            } else if(e instanceof MilkNotFoundException) {
                // 우유가 없으면 실행하는 블록
            } else if(e instanceof FoodNotFoundException) {
                // 먹을게 없으면 실행하는 블록
            }
            
            e.printStackTrace();
        }
    }
}

class Refrigerator implements AutoCloseable {
    @Override
    public void close() throws Exception {
        // 냉장고 문을 닫는다.
    }
}

class SnackNotFoundException extends Exception { }
class MilkNotFoundException extends Exception { }
class FoodNotFoundException extends Exception { }