package com.rock.pokemon.gdx.ui.box;

import com.rock.pokemon.gdx.Pokemon;
import com.rock.pokemon.gdx.model.mapConfig.BoxMapNode;

/**
 * 对话框 + 可选项框 实体
 *
 * @Author ayl
 * @Date 2023-11-22
 */
public class DialogueAndOptionBox {

    /**
     * 基础
     */

    //游戏对象
    private final Pokemon game;

    //对话框
    private DialogueBox dialogueBox;

    //可选项框
    private OptionBox optionBox;

    /**
     * 控制盒子当前展示 对应对话框/可选项 参数
     */

    //索引
    private int nodeIndex;

    //Box节点 配置类实体
    private BoxMapNode boxMapNode;

    /**
     * 初始化
     *
     * @param game       游戏对象
     * @param boxMapNode 盒子配置节点
     */
    public DialogueAndOptionBox(Pokemon game, BoxMapNode boxMapNode) {

        //记录游戏对象
        this.game = game;
        //记录盒子配置节点
        this.boxMapNode = boxMapNode;

        //初始化基本参数
        this.nodeIndex = 0;

        //初始化对话框、可选项框
        this.dialogueBox = new DialogueBox(this.game);
        this.optionBox = new OptionBox(this.game);

        //默认不显示
        this.dialogueBox.setVisible(false);
        this.optionBox.setVisible(false);

    }

    /**
     * 以下是 get set 方法
     */

    public DialogueBox getDialogueBox() {
        return this.dialogueBox;
    }

    public OptionBox getOptionBox() {
        return this.optionBox;
    }

}
