import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeffitTest {

    @Test
    void isHitFree() {
        Zeffit zef = new Zeffit();
        assertTrue(zef.isHitFree());
    }

    @Test
    void isGreen() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isGreen(),"Expecting: <True> for isGreen()\nGot: "+zef.isGreen());
    }

    @Test
    void isBlue() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isBlue(),"Expecting: <True> for isBlue()\nGot: "+zef.isBlue());
    }

    @Test
    void isRed() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isRed(),"Expecting: <True> for isRed()\nGot: "+zef.isRed());
    }

    @Test
    void isDead() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isDead(),"Expecting: <True> for isDead()\nGot: "+zef.isDead());
    }
}