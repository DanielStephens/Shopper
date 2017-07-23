package deal

import builder.Builder
import saving.Saving

trait DealSavingBuilder {

  def thatSaves(saving: Saving) : Builder[SimpleDeal]

}
