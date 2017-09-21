package cn.camork.smart_snake;

/**
 * 配置文件
 * @author guojian
 * @date 2016年12月30日 下午6:04:37
 * @email 1181819395@qq.com
 */
public class Config {

	public static final int MAZE_ROWS = 20;//必须大于9,否则蛇初始化到墙里了
	public static final int MAZE_COLS = 20;
	public static final double SPEED = 5; //速度
	public static final boolean SAVE = false; //默认不保存
	public static final String DIR = "snakeGame";//保存到桌面上的"snakeGame" 文件夹

}
