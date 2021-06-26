package com.HugoRandom.Oredium.common.particles;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FranitolinaParticle extends SpriteTexturedParticle{

	protected FranitolinaParticle(ClientWorld worldIn, double xCoordIn, double yCoordIn, double zCoordIn,
			double xSpeedIn, double ySpeddIn, double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeddIn, zSpeedIn);

		float F = this.random.nextFloat() * 1.0F;
		this.rCol = F;
		this.gCol = F;
		this.bCol = F;
		this.setSize(0.15F, 0.10F);
		this.scale(this.random.nextFloat() * 0.5F);
		this.xd *= 0.02D;
		this.yd *= 0.02D;
		this.zd *= 0.02D;
		this.age = (int) (20.0D/(Math.random() * 1.0D));
	}
	
	@Override
	public IParticleRenderType getRenderType() {		
		return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}
	
	@Override
	public void tick() {
		this.xo = this.x;
		this.yo = this.y;
		this.zo = this.z;
		if (this.age-- <= 0) {
			this.remove();
		} else {
			this.move(this.xd, this.yd, this.zd);
			this.xd *= (double)0.98F;
	        this.yd *= (double)0.98F;
	        this.zd *= (double)0.98F;
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public static class Factory implements IParticleFactory<BasicParticleType>{

		private final IAnimatedSprite spriteSet;
		
		public Factory(IAnimatedSprite sprite) {
			this.spriteSet = sprite;
		}
		
		@Override
		public Particle createParticle(BasicParticleType typeIn, ClientWorld worldIn, double x,
				double y, double z, double xSpeed, double ySpeed, double zSpeed) {			
			FranitolinaParticle xFranitolinaParticle = new FranitolinaParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
			xFranitolinaParticle.pickSprite(spriteSet);
			return xFranitolinaParticle;
		}
		
	}
}
