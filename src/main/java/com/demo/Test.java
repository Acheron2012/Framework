package com.demo;

import com.demo.utils.BaseDao;
import it.sauronsoftware.jave.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/mvc")
public class Test extends BaseDao {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String DaoTest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("哈哈");
//		logger.info("jdbcTemplate为空判断：{}",this.jdbcTemplate==null);
//		logger.info("mongoTemplate为空判断：{}",this.redisTemplate==null);
//		logger.info("redisTemplate为空判断：{}",this.mongoTemplate==null);
//	  				logger.info("mybatisTemplate为空判断：{}",this.sqlSessionTemplate==null);


        return "index";
    }
    
    public static void changeToMp3(String sourcePath, String targetPath) {  
  	  
        
        File source = new File(sourcePath);
        File target = new File(targetPath);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        try {
			encoder.encode(source, target, attrs);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InputFormatException e) {
			e.printStackTrace();
		} catch (EncoderException e) {
			e.printStackTrace();
		}
        
}

}
