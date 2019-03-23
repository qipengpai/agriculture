package com.qpp.common.utils.qrcode;/**
 * Created by HD on 2019/3/11.
 */

import com.swetake.util.Qrcode;
import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.data.QRCodeImage;
import jp.sourceforge.qrcode.exception.DecodingFailedException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName CreateQRCode
 * @Description TODO CreateQRCode
 * @Auther qipengpai
 * @Date 2019/3/11 14:21
 * @Version
 **/
public class CreateQRCode {
    /**
     * 创建二维码
     * @param qrData 生成二维码中要存储的信息
     * @param path   二维码图片存储路径 eg："D:/qrcode.png"
     * @throws Exception
     */
    public static boolean creatQrcode(String qrData, String path) {
        try {
            Qrcode qrcode = new Qrcode();
            qrcode.setQrcodeErrorCorrect('M');//纠错等级（分为L、M、H三个等级）
            qrcode.setQrcodeEncodeMode('B');//N代表数字，A代表a-Z，B代表其它字符
            qrcode.setQrcodeVersion(7);//版本

            //设置一下二维码的像素
            int width = 67 + 12 * (7 - 1);
            int height = 67 + 12 * (7 - 1);
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //绘图
            Graphics2D gs = bufferedImage.createGraphics();
            gs.setBackground(Color.WHITE);
            gs.setColor(Color.BLACK);
            gs.clearRect(0, 0, width, height);//清除下画板内容

            //设置下偏移量,如果不加偏移量，有时会导致出错。
            int pixoff = 2;

            byte[] d = qrData.getBytes("utf-8");
            if (d.length > 0 && d.length < 120) {
                boolean[][] s = qrcode.calQrcode(d);
                for (int i = 0; i < s.length; i++) {
                    for (int j = 0; j < s.length; j++) {
                        if (s[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            }
            gs.dispose();
            bufferedImage.flush();
            ImageIO.write(bufferedImage, "png", new File(path));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 解析二维码（QRCode）
     *
     * @param imgPath 图片路径
     * @return
     */
    public static String decoderQRCode(String imgPath) {
        //QRCode 二维码图片的文件
        File imageFile = new File(imgPath);
        BufferedImage bufImg = null;
        String content = null;
        try {
            bufImg = ImageIO.read(imageFile);
            QRCodeDecoder decoder = new QRCodeDecoder();
            content = new String(decoder.decode(new TwoDimensionCodeImage(bufImg)), "utf-8");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (DecodingFailedException dfe) {
            System.out.println("Error: " + dfe.getMessage());
            dfe.printStackTrace();
        }
        return content;
    }


    /**
     * 二维码基础类
     */
    static class TwoDimensionCodeImage implements QRCodeImage {
        //BufferedImage作用将一幅图片加载到内存中
        BufferedImage bufImg;
        public TwoDimensionCodeImage(BufferedImage bufImg) {
            this.bufImg = bufImg;
        }

        @Override
        public int getWidth() {
            return bufImg.getWidth();//返回像素宽度
        }

        @Override
        public int getHeight() {
            return bufImg.getHeight();//返回像素高度
        }

        @Override
        public int getPixel(int i, int i1) {
            return bufImg.getRGB(i, i1);//得到长宽值，即像素值，i,i1代表像素值
        }
    }

    public static void main(String[] args) {
        //creatQrcode("亓澎湃","d://qrcode//qpp.png");
        creatQrcode("晚上吃什么?","d://qrcode//cy.png");
        //System.out.println( decoderQRCode("d://qrcode//qpp.png"));
    }
}
