package com.kh.app.web.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 멤버필드의 생성자를 생성
public class CodeDecode {
  private String code;      //코드
  private String decode;    //디코드
}
