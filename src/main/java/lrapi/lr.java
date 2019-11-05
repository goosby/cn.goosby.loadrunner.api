package lrapi;

import java.util.logging.Logger;

/**
 * @Pacekage: PACKAGE_NAME
 * @Author: goosby.liu
 * @Date: 2019/11/05 10:22
 * @Version: 22
 * @Description: loadrunner.api
 **/
public class lr {

    private static Logger logger = Logger.getLogger("lrapi");

    public static final String PASS = "PASS";
    public static final String FAIL = "FAIL";
    public static final String AUTO = "AUTO";

    public static void start_transaction(String action_name) {
        logger.info(action_name + "started");
    }

    public static void error_message(String message){
        logger.info("error_message is: " + message);
    }

    public static void end_transaction(String action_name,String result){
        logger.info(action_name + "end;action result is: " + result);
    }

    public static void log_message(String message){
        logger.info("log_message is: " + message);
    }


    public static void output_message(String message){
        logger.info("output_message is: " + message);
    }

    public static void rendezvous(String rendezvous_name){
        logger.info("rendezvous_name is: " + rendezvous_name);
    }

    public static void think_time(int think_time){
        logger.info("think_time is: " + think_time);
    }

    public static void eval_int(String eval_int){
        logger.info("eval_int is: " + eval_int);
    }
    public static void save_string(String save_string){
        logger.info("save_string is: " + save_string);
    }

}
