package com.alibaba.seata.sample.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * description:
 * email: <a href="strongwalter2014@gmail.com">阿水</a>
 *
 * @author 阿水
 * @date 2019-04-21 19:00.
 */

@Service
@Scope("request")
public class YswService {

    public void print() {
        System.out.print("Request Scope Service");
    }
}
