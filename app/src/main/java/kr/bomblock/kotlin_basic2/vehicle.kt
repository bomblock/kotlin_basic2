package kr.bomblock.kotlin_basic2
// todo 제일 위에 있는 클래스를 super class, parent class, base Class 라고 부른다.
open class Vehicle{
    //properties
    //methods
}
//todo open class 이여아만 상속이 가능하다.
// 코틀린의 모든 클래스는 자동으로 최종값이다. 즉 자동으로 상속할수 없다 그렇기 때문에 처음 키워드를 오픈해서 사용해야한다.
// 상속을 원하지 않는다면 open 이 아닌 sealed 를 사용한다.
// 바로 아래 부분의 클래스는 서브 클래스 이다. sub class 혹은 child class Derived class 라고 부르기도 한다.
open class Car : Vehicle(){

}