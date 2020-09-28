# 이화여자대학교, 운영체제 강의 정리
* [링크](http://www.kocw.net/home/search/kemView.do?kemId=1046323)
* [강의소개](#강의소개)
    * [운영체제의 목표](#goal)
* [Introduction to operating system](#introduction-to-operating-system)

<BR>

## 강의소개
* 운영체제는 컴퓨터 하드웨어 바로 위에 설치되는 소프트웨어 계층으로서 모든 컴퓨터 시스템의 필수적인 부분이다. 
* 운영체제는 소프트웨어와 하드웨어를 연결하는 소프트웨어 계층이다.
    * 소프트웨어와 운영체제와의 관계
    * 운영체제와 하드웨어와의 관계
* 본 강좌에서는 이와 같은 운영체제의 개념과 역할, 운영체제를 구성하는 각 요소 및 알고리즘의 핵심적인 부분에 대해서 기초부터 학습.

### <a id="goal"></a>운영체제의 목표
* __컴퓨터의 자원을 효율적으로 관리__ (한정된 CPU 와 메모리가 전제된 상태)
    * 프로세스, 기억장치, 입출력 장치 등의 효율적 관리
        * 주어진 자원으로 최대한의 성능을 내도록 함
        * 사용자간의 형평성 있는 자원의 분배가 되도록 함
    * 실행중인 프로그램들에게 짧은 시간씩 CPU 를 번갈아 할당
        * 어떻게 할당할 것인가 ? 알고리즘을 이용
    * 실행중인 프로그램들에게 메모리 공간을 적절히 분배
    * 컴퓨터 시스템을 편리하게 사용할 수 있는 환경을 제공
        * 운영체제는 동시 사용자/프로그램들이 각각 독자적 컴퓨터에서 수행되는 것 같은 환상을 제공
        * 하드웨어를 직접 다루는 복잡한 부분을 운영체제가 대행

<BR>

## <a id="introduction-to-operating-system"></a>Introduction to Operating System
### 운영체제란 
* 운영체제의 좁은 의미
    * 커널, 운영체제의 핵심부분으로 메모리에 상주하는 부분
* 운영체제의 넓은 의미
    * 커널 뿐만 아니라 각종 주변 시스템 유틸리티를 포함한 개념
    * 메모리에 상주하지 않는 별도의 프로그램들을 의미
   
### [운영체제의 역할](#goal)

### 운영체제의 분류
* __동시 작업 가능 여부__
    * 단일작업 (Single Tasking)
        * 하나의 작업만 처리
        * MS-DOS 프롬프트 상에서는 한 명령의 수행을 끝내기 전에 다른 명령을 수행시킬 수 없음
    * 다중작업 (Multi Tasking)
        * 동시에 두 개 이상의 작업 처리
        * UNIX, MS Windows 등에서는 한 명령의 수행이 끝나기 전에 다른 명령이나 프로그램을 수행할 수 있음
* __사용자의 수__
    * 단일사용자 지원 운영체제
        * MS-DOS, MS Windows
    * 다중사용자 지원 운영체제
        * UNIX, NT server
* __처리방식__
    * 일괄처리 (batch processing)
        * 작업 요청의 일정량을 모아서 한꺼번에 처리
        * 작업이 완전히 종료될 때까지 기다려야 함
        * 일괄작업 내에 문제가 있을경우 수정하여 재 작업요청이 필요하다.
        * 주민센터 혹은 동사무소 생각할 수 있다.
    * 시분할 (time sharing)
        * 여러 작업을 수행할 떄 컴퓨터 처리 능력을 일정한 시간 단위로 분할하여 사용
        * 일괄처리 시스템에 비해 __짧은 응답시간__ 을 가짐
        * interactive 방식
        * __현재 우리가 쓰고 있는 방식__
    * 실시간 (realtime)
        * 정해진 시간 안에 어떠한 일이 반드시 종료됨이 보장되어야 하는 실시간 시스템을 위한 OS
        * 예) 원자로/공장 제어, 미사일 제어, 반도체 장비, 로보트 제어
        * 실시간 시스템의 개념 확장
            * Hard realtime system
                * 데드라인이 안 지켜지면 큰 문제가 발생한다.
            * Soft realtime system 
        * 정전이 일어나면 처음부터 다시 진행해야 한다.

### 용어정리
* 멀티태스킹
    * 하나의 프로그램이 끝나기 전에 다른 프로그램이 실행
    * CPU 가 번갈아서 작업을 수행 (CPU 는 매순간 하나의 작업을 수행)
* 멀티프로그래밍 
    * 여러 프로그램이 메모리에 올라가 있음을 강조
* Time sharing
    * Time sharing 은 CPU 의 시간을 분할하여 나누어 쓴다는 의미를 강조
* MultiProcess
    * 여러 프로그램이 동시에 실행됨을 의미
* __MultiProcessor ★★__
    * 하나의 컴퓨터에 CPU(processor) 가 여러 개 붙어있음을 의미
    * CPU 가 여러 개 있는 컴퓨터를 멀티 프로세서 컴퓨터라고 한다.

### 운영체제의 예
* unix
    * 코드의 대부분을 C 언어로 작성
    * 높은 이식성
        * 하나의 컴퓨터에서 돌아가는 기계어 집합을 다른 컴퓨터에 이식할 수 있다.
    * 최소한의 커널 구조 (대부분 C 언어로 작성)
        * 커널의 크기를 작게 만들어 놓았다.
    * 소스 코드 공개
    * 프로그램 개발에 용이
    * 다양한 버전
        * System V, FreeBSD, SunOS, Solaris
        * linux
* DOS (Disk Operating System)
    * 단일 사용자용 운영체제, 메모리 관리 능력의 한계 (주기억장치 : 640KB)
    * 하드웨어의 발전에 따라 코드가 복잡해짐에 따라 저문 OS 
* MS Windows
    * MS 사의 다중 작업용 GUI 기반 운영체제
    * Plug and Play, 네트워크 환경강화
    * DOS용 응용 프로그램과 호환성 제공
    * 불안정성
    * 풍부한 지원 소프트웨어

### 운영체제의 구조

<img src="https://github.com/pasudo123/SoftwareZeroToALL/blob/master/Image/2020-09-21_os-structure.png" />

* 자원을 관리하는 것이 운영체제의 목표.
    * CPU 스케쥴링 : 누구한테 CPU 를 줄 것인가
    * 메모리 관리 : 한정된 메모리를 어떻게 나눌 것인가
        * 메모리에 너무 많은 프로그램을 올리기 보다는 CPU 에서 필요로 하는 프로그램을 메모리에 올려야 한다.
        * 메모리에서 올리지 않은 프로그램을 어떻게 결정할 것인가. (:미래예측)
    * 파일 관리 : 디스크에 파일을 어떻게 보관할 것인가
    * 입출력 관리 : 각기 다른 입출력장치와 컴퓨터 간에 정보를 어떻게 주고받을 것인가.
        * 인터럽트에 기반하여 관리한다.
    * 프로세스 관리
        * 프로세스의 생성과 삭제
        * 자원 할당 및 반환
        * 프로세스 간 협력
    * 그 외
        * 보호 시스템
        * 네트워킹
        * 명령어 해석기 (커맨드라인 인터프리터)