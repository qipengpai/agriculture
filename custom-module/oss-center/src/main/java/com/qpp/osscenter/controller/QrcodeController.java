package com.qpp.osscenter.controller;/**
 * Created by HD on 2019/3/11.
 */

import com.qpp.common.base.AjaxResult;
import com.qpp.common.utils.qrcode.CreateQRCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName QrcodeController
 * @Description TODO 创建二维码
 * @Auther qipengpai
 * @Date 2019/3/11 14:27
 * @Version
 **/
@Controller
@RequestMapping("/qrcode")
public class QrcodeController {

    @Value("${portals.upload.image.path}")
    private String qrcodePath; //二维码存储路径

    /**
     * 创建二维码
     * @return
     */
    @ResponseBody
    @PostMapping("/add.dd")
    public AjaxResult addQrcode(HttpServletRequest request){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("code",false);
        String qrData=request.getParameter("qrData");
        String qrSuffix=request.getParameter("qrSuffix");
        String qrcode=System.currentTimeMillis()+"."+qrSuffix;
        String path=qrcodePath+qrcode;
        boolean getQrcode= CreateQRCode.creatQrcode(qrData,path);
        if(getQrcode==true){
            ajaxResult.put("code",true);
            ajaxResult.put("data",qrcode);
        }
        return ajaxResult;
    }

    /**
     * 解析二维码
     * @return
     */
    @ResponseBody
    @PostMapping("/decoder.dd")
    public AjaxResult decoderQrcode(HttpServletRequest request){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("code",false);
        String qrcode=request.getParameter("qrcode");
        String qrData=CreateQRCode.decoderQRCode(qrcodePath+qrcode);
        if(qrData!=null && !"".equals(qrData)){
            ajaxResult.put("code",true);
            ajaxResult.put("data",qrcode);
        }
        return ajaxResult;
    }

}
