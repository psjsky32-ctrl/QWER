package hw; 
import java.util.*; 
/**
 * scanner o x 50프로
 * while(true) 1번부터 9번까지 9개 만들기 random.nextNoolean 50프로 만들기 새로운 배열 편명과 map에 등록하기
 * map에 입력한 편명에 해당하는 좌석 리스트를 꺼내기
 */
public class AirplaneReservation { // 비행기 예약 시스템을 실행하는 메인 클래스입니다.
    public static void main(String[] args) { // 프로그램 실행 시 가장 먼저 시작되는 메서드입니다.
        // 사용자로부터 키보드 입력을 받기 위해 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in); 
        // 좌석 상태(O/X)를 무작위로 설정하기 위해 랜덤 객체를 생성합니다.
        Random random = new Random(); 
        
        // 편명(Key)과 해당 편명의 좌석 리스트(Value)를 연결하여 저장하는 공간을 만듭니다.
        Map<String, List<Tickets>> flightMap = new HashMap<>(); 

        // 비행기 편명을 계속 입력받을 수 있도록 바깥쪽 무한 루프를 시작합니다.
        while (true) { 
            // 사용자에게 시스템 안내 메시지를 출력합니다.
            System.out.println("\n비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다."); 
            // 입력 유도 문구를 출력합니다.
            System.out.print("비행기 편의 이름을 입력하세요: "); 
            
            // 사용자가 입력한 비행기 편명 문자열을 flightNumber 변수에 담습니다.
            String flightNumber = sc.next(); 

            // 만약 처음 입력한 편명이라 Map에 데이터가 없다면 실행합니다.
            if (!flightMap.containsKey(flightNumber)) { 
                // 새로운 좌석 객체들을 보관할 리스트를 생성합니다.
                List<Tickets> newSeats = new ArrayList<>(); 
                // 1번부터 9번까지 총 9개의 좌석을 만듭니다.
                for (int i = 1; i <= 9; i++) { 
                    // [핵심] random.nextBoolean()으로 각 좌석의 초기 예약 여부를 무작위로 결정합니다.
                    // true가 나오면 X(불가), false가 나오면 O(가능) 상태로 리스트에 담깁니다.
                    newSeats.add(new Tickets(i, random.nextBoolean())); 
                }
                // 완성된 무작위 좌석 리스트를 해당 편명과 함께 Map에 등록합니다.
                flightMap.put(flightNumber, newSeats); 
            }

            // Map에서 입력한 편명에 해당하는 좌석 리스트를 꺼내와서 seats 변수에 참조시킵니다.
            List<Tickets> seats = flightMap.get(flightNumber); 
            
            // 특정 비행기 안에서 예약 과정을 반복하는 내부 무한 루프입니다.
            while (true) { 
                // 해당 편명의 현재 좌석 현황을 화면에 보여줍니다.
                System.out.println("\n\"" + flightNumber + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)"); 
                // 리스트에 저장된 9개 좌석을 순회하며 상태를 출력합니다.
                for (int i = 0; i < seats.size(); i++) { 
                    // Tickets 클래스의 toString()이 호출되어 "번호: 상태" 형식으로 출력되며, 마지막이 아니면 쉼표를 붙입니다.
                    System.out.print(seats.get(i) + (i == seats.size() - 1 ? "" : ", ")); 
                }
                // 숫자가 아닌 문자 입력 시 프로그램 오류를 막기 위한 변수입니다.
                int num = 0; 
                // 올바른 숫자를 입력받을 때까지 반복합니다.
                while (true) { 
                    try { 
                        System.out.print("좌석 예약을 하려면 번호를 입력하세요: "); 
                        // 정수 타입의 숫자를 입력받습니다.
                        num = sc.nextInt(); 
                        // 숫자 입력에 성공하면 예외 루프를 빠져나갑니다.
                        break; 
                    } catch (InputMismatchException e) { 
                        // 문자가 입력되어 에러가 발생한 경우 실행되는 블록입니다.
                        System.out.println("잘못된 입력입니다. 숫자로만 입력해주세요."); 
                        // Scanner 버퍼에 남아있는 문자열 쓰레기 데이터를 비워줍니다.
                        sc.nextLine(); 
                    }
                }

                // 입력받은 숫자가 유효한 좌석 번호(1~9)인지 체크합니다.
                if (num < 1 || num > seats.size()) { 
                    System.out.println("잘못된 좌석 번호입니다. 1~" + seats.size() + " 사이의 번호를 입력하세요."); 
                    // 다시 좌석 번호 입력 단계로 돌아갑니다.
                    continue; 
                }

                // 리스트 인덱스(0부터 시작)에 맞춰 선택한 좌석 객체를 가져옵니다.
                Tickets target = seats.get(num - 1); 

                // 선택한 좌석이 이미 예약(true) 상태인지 검사합니다.
                if (target.isReserve()) { 
                    System.out.println("\"" + num + "\"번 좌석은 이미 예약된 좌석입니다."); 
                    // 다시 번호 입력 단계로 이동합니다.
                    continue; 
                } 

                // 예약 가능한 좌석일 경우 최종 예약 의사를 묻습니다.
                System.out.print("\"" + num + "\"번 좌석을 예약하시겠습니까? (y/N): "); 
                // 대소문자 구분 없이 'y'를 입력했을 때만 실행합니다.
                if (sc.next().equalsIgnoreCase("y")) { 
                    // 해당 좌석의 예약 상태를 true(X)로 변경하여 확정합니다.
                    target.setReserve(true); 
                    System.out.println("\"" + num + "\"번 좌석 예약이 완료되었습니다."); 
                    break; 
                } else { 
                    // 'y' 이외의 값을 입력한 경우 취소 메시지를 띄웁니다.
                    System.out.println("예약을 취소하셨습니다. 다시 번호를 선택하세요."); 
                }
            } // 내부 while 끝 (좌석 예약 과정 종료)
        } // 외부 while 끝 (비행기 편명 관리 반복 종료)
    }
}