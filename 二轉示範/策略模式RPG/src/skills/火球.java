package skills;

import battle.Battle;
import role.Role;

/**
 * @author johnny850807@gmail.com (Waterball))
 */
public class 火球 extends AbstractSkill {
    @Override
    public void effect(Role skillOwner, Battle battle) {
        Role target = skillOwner.makeTargetDecision(battle.getOpponents());
        int actualDamage = target.doMagicDamage(150);
        super.effect(skillOwner, battle);
        System.out.printf("選擇的攻擊對象為 %s！造成了 %d點傷害。\n", target.getName(), actualDamage);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getRequiredMP() {
        return 50;
    }
}
