package com.rock.pokemon.gdx.common;

/**
 * 文件地址类,所有文件路径都存放在这里
 * 文件包括: 图片、音效、音乐、文本
 *
 * @Author ayl
 * @Date 2022-10-12
 */
public class FilePaths {

    /**
     * 系统配置
     */

    //文本文件地址
    public static final String SYSTEM_CONFIG_TEXT_FILE_PATH = "assets/text/%s/Text.txt";

    /**
     * 世界配置
     */

    //配置文件路径-未白镇地图
    public static final String MAP_CONFIG_PATH_OF_LITTLE_ROOT = "assets/mapConfig/LittleRoot.json";
    //配置文件路径-事物
    public static final String MAP_CONFIG_PATH_OF_WORLD_OBJECT = "assets/mapConfig/WorldObject.json";

    /**
     * 音乐
     */

    //未白镇Bgm
    public static final String LITTLE_ROOT_BGM = "music/town/LittleRoot.mp3";

    /**
     * 音效
     */

    //撞墙音效
    public static final String SOUND_NO_WALK = "music/sound/emerald_0007_no_walk.wav";

}
