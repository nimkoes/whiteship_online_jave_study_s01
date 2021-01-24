package me.xxxelppa.study.week09;

public class Exam_002 {
    public static void main(String[] args) {
        
        boolean isSnack = true;
        boolean isMilk = true;
        boolean isFood = true;
        
        try {
            
            // 냉장고 문을 연다.
            
            // 간식을 찾는다.
            
            // 간식이 없으면 예외 발생
            if(!isSnack) throw new SnackNotFoundException();
            
            // 우유가 없으면 예외 발생
            if(!isMilk) throw new MilkNotFoundException();
            
            // 먹을게 없으면 예외 발생
            if(!isFood) throw new FoodNotFoundException();
            
            // 간식을 꺼낸다.
            
            // 냉장고 문을 닫는다.
            
        } catch (SnackNotFoundException snfe) {
            
            // 간식이 없으면 실행하는 블록
            
            // 냉장고 문을 닫는다.
            
        } catch (MilkNotFoundException mnfe) {
            
            // 우유가 없으면 실행하는 블록
    
            // 냉장고 문을 닫는다.
            
        } catch (FoodNotFoundException mnfe) {
            
            // 먹을게 없으면 실행하는 블록
    
            // 냉장고 문을 닫는다.
            
        }
    }
}

// class SnackNotFoundException extends Throwable { }
// class MilkNotFoundException extends Throwable { }
// class FoodNotFoundException extends Throwable { }