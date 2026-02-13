package net.egon.moretrees.client;

import net.minecraft.client.model.Model;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.AbstractBoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.BoatEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Unit;

public class ModBoatEntityRenderer extends AbstractBoatEntityRenderer {
    private final Model.SinglePartModel waterMaskModel;
    private final Identifier texture;
    private final EntityModel<BoatEntityRenderState> model;

    public ModBoatEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, Identifier texture) {
        super(ctx);
        this.texture = texture;
        this.waterMaskModel = new Model.SinglePartModel(
                ctx.getPart(EntityModelLayers.BOAT),
                id -> RenderLayers.waterMask()
        );
        this.model = new BoatEntityModel(ctx.getPart(layer));
    }

    @Override
    protected EntityModel<BoatEntityRenderState> getModel() {
        return model;
    }

    @Override
    protected RenderLayer getRenderLayer() {
        return model.getLayer(texture);
    }

    @Override
    protected void renderWaterMask(BoatEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue queue, int light) {
        if (state.submergedInWater) {
            return;
        }
        queue.submitModel(
                waterMaskModel,
                Unit.INSTANCE,
                matrices,
                waterMaskModel.getLayer(texture),
                light,
                OverlayTexture.DEFAULT_UV,
                state.outlineColor,
                null
        );
    }
}
