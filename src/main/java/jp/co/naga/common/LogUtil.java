package jp.co.naga.common;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogUtil {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("引数にファイル名を指定してください");
            return;
        }
        File file = new File(args[0]);

        //インスタンスの生成
        Logger logger = (Logger) Logger.getLogger(LogUtil.class.getName());
        BasicConfigurator.configure();

        //ログレベルが WARN 以上の場合にログイベントが発生するように設定
        logger.setLevel(Level.WARN);

        if (file.length() > 5000 && file.length() <= 10000) {
            //warn
            logger.warn("5KBより大きいファイルです");
        } else if (file.length() > 10000) {
            //error
            logger.error("10KBより大きいファイルです");
        } else {
            //debug(出力されないレベル)
            logger.debug(file + "を読み込みました");
        }
    }
}
