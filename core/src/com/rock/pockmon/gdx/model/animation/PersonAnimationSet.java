package com.rock.pockmon.gdx.model.animation;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.rock.pockmon.gdx.enums.DirectionEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个人物动画集合
 * 一个人物实体会有一个,存储着该人物所有的动画
 *
 * @Author ayl
 * @Date 2022-10-17
 */
public class PersonAnimationSet {

    /**
     * 每种动作的动画、图片缓存
     */

    //走-动画map
    private Map<DirectionEnum, Animation<TextureRegion>> walkingMap;
    //站-图片map
    private Map<DirectionEnum, TextureRegion> standingMap;

    //初始化
    public PersonAnimationSet(AssetManager assetManager) {
        //获取资源
        TextureAtlas walkTextureAtlas = assetManager.get("assets/packed/image/people/ruby/walk/textures.atlas", TextureAtlas.class);
        TextureAtlas standTextureAtlas = assetManager.get("assets/packed/image/people/ruby/stand/textures.atlas", TextureAtlas.class);
        //初始化走路map
        walkingMap = new HashMap<>();
        //循环方向枚举
        for (DirectionEnum walkDir : DirectionEnum.values()) {
            //载入动画 秒/帧(N图-1=帧),名字,模式,并组装
            walkingMap.put(walkDir, new Animation(0.3F / 2F, walkTextureAtlas.findRegions(walkDir.getName()), Animation.PlayMode.LOOP_PINGPONG));
        }
        //初始化站立map
        standingMap = new HashMap<>();
        //循环
        for (DirectionEnum standDir : DirectionEnum.values()) {
            //载入图片,并组装
            standingMap.put(standDir, standTextureAtlas.findRegion(standDir.getName()));
        }
    }

    /**
     * 走路
     *
     * @param directionEnum 根据方向获取走路动画
     * @return
     */
    public Animation<TextureRegion> getWalking(DirectionEnum directionEnum) {
        //返回
        return this.walkingMap.get(directionEnum);
    }

    /**
     * 站立
     *
     * @param directionEnum 根据方向获取站立图片
     * @return
     */
    public TextureRegion getStanding(DirectionEnum directionEnum) {
        //返回
        return this.standingMap.get(directionEnum);
    }

}
