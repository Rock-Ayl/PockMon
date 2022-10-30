package com.rock.pokemon.gdx.screen.town;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rock.pokemon.gdx.Pokemon;
import com.rock.pokemon.gdx.common.FilePaths;
import com.rock.pokemon.gdx.controller.InputController;
import com.rock.pokemon.gdx.enums.PersonEnum;
import com.rock.pokemon.gdx.model.Camera;
import com.rock.pokemon.gdx.model.map.World;
import com.rock.pokemon.gdx.model.people.Person;
import com.rock.pokemon.gdx.screen.renderer.WorldRenderer;

/**
 * 未白镇(开局城镇)
 *
 * @Author ayl
 * @Date 2022-10-15
 */
public class LittleRoot implements Screen {

    //游戏对象
    private final Pokemon game;

    //背景音乐
    private Music music;

    //一个自定义的相机
    private Camera camera;

    //输入控制器
    private InputController inputController;

    //未白镇的世界实体
    private World world;

    //未白镇的世界渲染器
    private WorldRenderer worldRenderer;

    //主角实体
    private Person adventurer;

    /**
     * 初始化未白镇
     *
     * @param pokemon 游戏对象
     */
    public LittleRoot(final Pokemon pokemon) {

        /**
         * 基本
         */

        //记录游戏对象
        this.game = pokemon;

        //初始化自定义相机
        this.camera = new Camera();

        /**
         * 音乐
         */

        //初始化未白镇背景音乐音乐
        this.music = Gdx.audio.newMusic(Gdx.files.internal(FilePaths.LITTLE_ROOT_BGM));
        //音乐循环播放
        this.music.setLooping(true);

        /**
         * 世界
         */

        //初始化世界
        this.world = new World(this.game.getAssetManager(), 15, 10);

        //初始化世界渲染器
        this.worldRenderer = new WorldRenderer(this.game.getAssetManager(), this.world);

        /**
         * 主角相关
         */

        //初始化主角
        this.adventurer = new Person(PersonEnum.RUBE, this.world, 7, 3, this.game.getAssetManager(), this.game.getSoundManager());

        //初始化输入监听,控制主角的行动
        this.inputController = new InputController(this.adventurer);

    }

    @Override
    public void show() {

        //当显示画面时,立即播放音乐
        this.music.play();

        //当显示画面时,开始监控键盘控制
        Gdx.input.setInputProcessor(inputController);

    }

    /**
     * 每帧处理
     *
     * @param delta 帧时间
     */
    @Override
    public void render(float delta) {

        //每帧根据主角坐标,更新相机坐标
        this.camera.update(
                this.adventurer.getWorldX() + 0.5F,
                this.adventurer.getWorldY() + 0.5F)
        ;

        //黑幕
        ScreenUtils.clear(Color.BLACK);

        //每帧更新输入控制器
        this.inputController.update(delta);

        //每帧更新世界
        this.world.update(delta);

        //开始渲染 地图、人物
        this.game.getBatch().begin();

        //渲染整个世界
        this.worldRenderer.render(this.game, this.camera);

        //结束渲染
        this.game.getBatch().end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        this.music.dispose();
    }

}
