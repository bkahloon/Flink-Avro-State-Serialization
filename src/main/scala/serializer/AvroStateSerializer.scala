package serializer
import com.sksamuel.avro4s.{Decoder, Encoder, SchemaFor}
import org.apache.flink.api.common.typeutils.TypeSerializer
import org.apache.flink.core.memory.{DataInputView, DataOutputView}
import scala.reflect.ClassTag

class AvroStateSerializer[T<: Product: Encoder: Decoder: SchemaFor: ClassTag[T] ] extends TypeSerializer[T] {

  override def serialize(record: T, target: DataOutputView): Unit = {

  }

  override def deserialize(source: DataInputView): T = {

  }

}
