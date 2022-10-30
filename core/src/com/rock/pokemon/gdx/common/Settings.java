package com.rock.pokemon.gdx.common;

import com.rock.pokemon.gdx.enums.LanguageEnum;

/**
 * 配置类,所有通用配置都存在在这里
 *
 * @Author ayl
 * @Date 2022-10-12
 */
public class Settings {

    /**
     * 系统配置
     */

    //标题
    public static final String TITLE = "Pokemon By Rock";
    //游戏版本
    public static final String VERSION = "0.0.5";

    //todo 当前语言(暂时固定为中文)
    public static LanguageEnum LANG = LanguageEnum.SIMPLIFIED_CHINESE;

    /**
     * 地图、贴图配置
     */

    //地图/贴图/人物单个网格大小
    public static int TILE_SIZE = 16;
    //缩放倍率
    public static int SCALE = 3;
    //一坐标数值的地图块或人物的真实的大小(16的贴图看起来还是模糊,32就好点)
    public static int SCALED_TILE_SIZE = TILE_SIZE * SCALE;

    //GBA屏幕分辨率为 240 * 160 比例固定,这里按照缩放倍率取,另外,绿宝石无论尺寸大小,x轴固定为15个长度地图块,y轴则不按照地图块算
    public static int WINDOW_WIDTH = 240 * SCALE;
    public static int WINDOW_HEIGHT = 150 * SCALE;

    //是否使用垂直同步
    public static boolean USE_VERTICAL_SYNC = true;

    //游戏FPS(帧率),推荐200
    public static int FPS_60 = 60;
    public static int FPS_144 = 144;
    public static int FPS_200 = 200;

}
