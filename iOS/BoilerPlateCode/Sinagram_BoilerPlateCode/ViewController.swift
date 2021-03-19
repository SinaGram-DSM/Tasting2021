//
//  ViewController.swift
//  Sinagram_BoilerPlateCode
//
//  Created by 장서영 on 2021/03/17.
//

import UIKit

class ViewController: UIViewController {
    
    var lastPoint: CGPoint! // 바로 전에 터치 or 이동한 위치
    var lineSize: CGFloat = 1.0 // 선 두께를 2.0으로 설정
    var lineColor = UIColor.black // 선 색상을 파란색으로 설정(기본값)

    // IBOutlet 직접 해보기~!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    @IBAction func clearImageView(_ sender: UIButton){
        // 스케치를 초기화 시켜주는 함수 만들어보기
    }
    
    @IBAction func color1Btn(_ sender: UIButton){
        // 펜 색을 자신이 원하는 색1로 바꿔주는 함수 만들어보기
    }
    
    @IBAction func color2Btn(_ sender: UIButton){
        // 펜 색을 자신이 원하는 색2로 바꿔주는 함수 만들어보기
    }

    @IBAction func color3Btn(_ sender: UIButton){
        // 펜 색을 자신이 원하는 색3로 바꿔주는 함수 만들어보기
    }
    
    @IBAction func lineStepper(_ sender: UIStepper){
        // 펜 굵기를 설정해주는 함수 만들어보기
    }
    
    
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        // 터치가 일어났을 때 실행되는 함수 만들어보기
    }
   
    override func touchesMoved(_ touches: Set<UITouch>, with event: UIEvent?) {
        // 터치가 움직였을 때 실행되는 함수 만들어보기
    }
    
    override func touchesEnded(_ touches: Set<UITouch>, with event: UIEvent?) {
        // 터치가 끝났을 때 실행되는 함수 만들어보기
    }
    
    override func motionEnded(_ motion: UIEvent.EventSubtype, with event: UIEvent?) {
        // 휴대폰을 흔드는 모션이 끝났을 때 스케치를 초기화하는 함수 만들기
    }
    
    func buttonStyle(button: UIButton){
        // 버튼을 동그랗고 예쁘게 빚어보기
    }
    
}



