package java_exam;

public class hw {

    public static String computeGrade(int subjA, int subjB, int subjC, int subjD, int subjE) {
        // 과목 점수를 모두 더해 총점을 구함
        int amount = subjA + subjB + subjC + subjD + subjE;
        
        double average = calcAverage(amount, 5);
        
        System.out.println("평균 점수: " + String.format("%.2f", average));
        
        String grade = calcGrade(average);
        
        return grade;
    }


    public static double calcAverage(int amount, int subjectCount) {
        double result = 0; // 결과 저장용 변수
        
        // 0으로 나누는 에러 방지
        if (subjectCount != 0) {
            // (double) 형변환을 통해 소수점까지 계산되도록 함
            result = (double) amount / subjectCount;
        }
        
        return result; // 최종 결과 한 번만 리턴
    }


    public static String calcGrade(double average) {
        String grade = "F"; // 기본값을 F로 설정
        
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        }
        
        return grade; 
    }

    public static void main(String[] args) {
        // 5개 과목 점수를 파라미터로 전달
        String grade = computeGrade(100, 95, 95, 100, 100);
        
        // 최종 학점 출력
        System.out.println("최종 학점: " + grade); // 결과: "A"
    }
}